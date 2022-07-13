package samsung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class UserSolution {
    private int mId;
    private int mGrade;
    private char mGender[];
    private int mScore;
    public ArrayList<UserSolution> femaleList = new ArrayList<>();
    public ArrayList<UserSolution> maleList = new ArrayList<>();

    public UserSolution() {
    }

    public UserSolution(int mId, int mGrade, char[] mGender, int mScore) {
        this.mId = mId;
        this.mGrade = mGrade;
        this.mGender = mGender;
        this.mScore = mScore;
    }


    public void init() {
        femaleList = new ArrayList<>();
        maleList = new ArrayList<>();
        //list 초기화 작업
    }

    public int add(int mId, int mGrade, char mGender[], int mScore) {
        int result = 0;
        UserSolution user = new UserSolution(mId, mGrade, mGender, mScore);
        char mgender = mGender[0];
        if (mgender == 'f') {
            femaleList.add(user);
            Collections.sort(femaleList, new Comparator<UserSolution>() {
                @Override
                public int compare(UserSolution o1, UserSolution o2) {
                    if (o1.mScore < o2.mScore) return -1;
                    if (o1.mScore > o2.mScore) return 1;

                    if (o1.mId < o2.mId) return -1;
                    if (o1.mId > o2.mId) return 1;

                    return 0;
                }
            });

            for (int i = femaleList.size() - 1; i >= 0; i--) {
                if (femaleList.get(i).mGrade == mGrade) {
                    result = femaleList.get(i).mId;
                    break;
                }
            }


            //System.out.println("add="+result);
            return result;
        } else {
            maleList.add(user);
            Collections.sort(maleList, new Comparator<UserSolution>() {
                @Override
                public int compare(UserSolution o1, UserSolution o2) {
                    if (o1.mScore < o2.mScore) return -1;
                    if (o1.mScore > o2.mScore) return 1;

                    if (o1.mId < o2.mId) return -1;
                    if (o1.mId > o2.mId) return 1;
                    return 0;
                }
            });
            for (int i = maleList.size() - 1; i >= 0; i--) {
                if (maleList.get(i).mGrade == mGrade) {
                    result = maleList.get(i).mId;
                    break;
                }
            }
            //  System.out.println("add="+result);
            return result;
        }


    }
    public int remove(int mId) {
        char mgender = ' ';
        int mgrade = 0;
        int result = 0;

        boolean check = false;
        // System.out.println("삭제 Id =="+mId);
        //mid==mid인 user table 가져오기
        for (UserSolution userSolution : femaleList) {
            if (userSolution.mId == mId) {
                check = true;
                mgender = userSolution.mGender[0];
                //System.out.println("성별="+mgender +"   아이디="+userSolution.mId);
                mgrade = userSolution.mGrade;
                // System.out.println("해당 학년=="+mgrade);
                break;
            }
        }
        if (!check) {
            for (UserSolution userSolution : maleList) {
                if (userSolution.mId == mId) {
                    check = true;
                    mgender = userSolution.mGender[0];
                    //System.out.println("성별="+mgender +"   아이디="+userSolution.mId);
                    mgrade = userSolution.mGrade;
                    //  System.out.println("해당 학년=="+mgrade);
                    break;
                }
            }
        }
        if (!check) {
            return result;
        }

        if (mgender == 'f') {
            UserSolution removeTarget = null;
            //     System.out.println("여자");
            //해당 id로 삭제
            for (UserSolution userSolution : femaleList) {
                if (userSolution.mId == mId) {
                    removeTarget = userSolution;
                }
                ;
            }
            //   System.out.println("삭제 전=="+femaleList.size());
            femaleList.remove(removeTarget);
            //   System.out.println("삭제 후=="+femaleList.size());

            // 학년이 같은 학생을 찾는 로직
            for (int i = 0; i < femaleList.size(); i++) {
                if (femaleList.get(i).mGrade == mgrade) {
                    result = femaleList.get(i).mId;
                    //  System.out.println("result=="+ result);
                    // System.out.println("#####################################################");
                    return result;
                }

            }
        }// end female

        if (mgender == 'm') {
            UserSolution removeTarget = null;
            //  System.out.println("여자");
            //해당 id로 삭제
            // System.out.println("삭제 전=="+maleList.size());
            for (UserSolution userSolution : maleList) {
                if (userSolution.mId == mId) {
                    removeTarget = userSolution;
                }
                ;
            }
            maleList.remove(removeTarget);
            // System.out.println("삭제 후=="+maleList.size());

            // 학년이 같은 학생을 찾는 로직
            for (int i = 0; i < maleList.size(); i++) {

                if (maleList.get(i).mGrade == mgrade) {

                    result = maleList.get(i).mId;
                    // System.out.println("result=="+ result);
                    //  System.out.println("#####################################################");
                    return result;
                }
            }


        }
        // System.out.println("@@@@@@@@@@@@@@@@@@@@@@###########!***********"+result);
        // System.out.println("------------------------------------------------");
        return result;
        //remove 해당 값이 없을 때 return 0;
    }// end remove
    public int query(int mGradeCnt, int mGrade[], int mGenderCnt, char mGender[][], int mScore) {
        int result = 0;
        ArrayList<UserSolution> userList = new ArrayList<>();

        if (mGenderCnt == 1) {
            char mgender = mGender[0][0];
            extracted(mGradeCnt, mGrade, mScore, userList, mgender);
        } else {
            for (char[] chars : mGender) {
                char mgender = chars[0];
                extracted(mGradeCnt, mGrade, mScore, userList, mgender);
            }// end char[];
        }
        if (userList.size() == 1) {
            result = userList.get(0).mId;
        }
        if (userList.size() >= 2) {
            Collections.sort(userList, new Comparator<UserSolution>() {
                @Override
                public int compare(UserSolution o1, UserSolution o2) {
                    if (o1.mScore > o2.mScore) return -1;
                    if (o1.mScore < o2.mScore) return 1;

                    if (o1.mId > o2.mId) return -1;
                    if (o1.mId < o2.mId) return 1;
//                if (Integer.compare(o1.mId,o2.mId)>0) return -1;
//                if (Integer.compare(o1.mId,o2.mId)<0) return 1;

                    return 0;
                }
            });

            result = userList.get(userList.size() - 1).mId;
        }
        return result;

    }
    private void extracted(int mGradeCnt, int[] mGrade, int mScore, ArrayList<UserSolution> userList, char mgender) {
        if (mgender == 'f') {
            if (mGradeCnt == 1) {
                for (UserSolution userSolution : femaleList) {
                    if (mGrade[0] == userSolution.mGrade && userSolution.mScore >= mScore) {
                        userList.add(userSolution);
                        //System.out.println("female i=="+i +"  userId"+userSolution.mId+" 학년=="+ userSolution.mGrade +" 성적=="+userSolution.mScore);
                    }
                }

            } else {
                //학년별로 넣기
                for (int i : mGrade) {
                    for (UserSolution userSolution : femaleList) {
                        if (i == userSolution.mGrade && userSolution.mScore >= mScore) {
                            userList.add(userSolution);
                            //System.out.println("female i=="+i +"  userId"+userSolution.mId+" 학년=="+ userSolution.mGrade +" 성적=="+userSolution.mScore);
                        }
                    }
                }
            }

        }
        if (mgender == 'm') {
            if (mGradeCnt == 1) {
                for (UserSolution userSolution : maleList) {
                    if (mGrade[0] == userSolution.mGrade && userSolution.mScore >= mScore) {
                        userList.add(userSolution);
                        // System.out.println("male i=="+i +"  userId"+userSolution.mId +"학년=="+ userSolution.mGrade+" 성적=="+userSolution.mScore);
                    }
                }
            } else {
                for (int i : mGrade) {
                    for (UserSolution userSolution : maleList) {
                        if (i == userSolution.mGrade && userSolution.mScore >= mScore) {
                            userList.add(userSolution);
                            // System.out.println("male i=="+i +"  userId"+userSolution.mId +"학년=="+ userSolution.mGrade+" 성적=="+userSolution.mScore);
                        }
                    }
                }
            }

        }//end else;
    }


}

