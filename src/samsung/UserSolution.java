package samsung;

import java.util.*;

class UserSolution {
    private int mId;
    private int mGrade;
    private char mGender[];
    private int mScore;
    public ArrayList<UserSolution> femaleList = new ArrayList<>();
    public ArrayList<UserSolution> maleList = new ArrayList<>();



    public UserSolution(){
    }

    public UserSolution(int mId, int mGrade, char[] mGender, int mScore) {
        this.mId = mId;
        this.mGrade = mGrade;
        this.mGender = mGender;
        this.mScore = mScore;
    }


    public void init() {
        //list 초기화 작업
        return;
    }


    public int add(int mId, int mGrade, char mGender[], int mScore) {
        int result=0;
        UserSolution user = new UserSolution(mId, mGrade, mGender,mScore);
        String mgender = String.valueOf(mGender).trim();
        int userGrade = user.mGrade;
        if(mgender.equals("female")){
           femaleList.add(user);
           Collections.sort(femaleList, new Comparator<UserSolution>() {
               @Override
               public int compare(UserSolution o1, UserSolution o2) {
                   if(o1.mScore < o2.mScore) return -1;
                   if(o1.mScore> o2.mScore) return 1;

                   if (Integer.compare(o1.mId,o2.mId)<0) return -1;
                   if (Integer.compare(o1.mId,o2.mId)>0) return 1;

                   return 0;
               }
           });

            for (int i = femaleList.size()-1;i >=0; i--) {
               if(femaleList.get(i).mGrade==mGrade){
                   result=femaleList.get(i).mId;
                   break;
               }
            }


            System.out.println("add="+result);
            return result;
        }else{
            maleList.add(user);
            Collections.sort(maleList, new Comparator<UserSolution>() {
                @Override
                public int compare(UserSolution o1, UserSolution o2) {
                    if(o1.mScore < o2.mScore) return -1;
                    if(o1.mScore> o2.mScore) return 1;

                    if (Integer.compare(o1.mId,o2.mId)<0) return -1;
                    if (Integer.compare(o1.mId,o2.mId)>0) return 1;
                    return 0;
                }
            });
            for (int i = maleList.size()-1;i >=0; i--) {
                if(maleList.get(i).mGrade==mGrade){
                    result=maleList.get(i).mId;
                    break;
                }
            }
            System.out.println("add="+result);
            return result;}


    }


    public int remove(int mId) {
        String mgender="";
        int mgrade=0;
        int result=0;
        //System.out.println("mid check=="+mId);
        //mid==mid인 user table 가져오기 
        for (UserSolution userSolution : femaleList) {
            if (userSolution.mId==mId){
                mgender = String.valueOf(userSolution.mGender).trim();
               // System.out.println("female List id=="+userSolution.mId);
                //System.out.println("성별=="+mgender);
                mgrade=userSolution.mGrade;

                break;
            }
        }
        for (UserSolution userSolution : maleList) {
            if (userSolution.mId==mId){
                mgender = String.valueOf(userSolution.mGender).trim();
               // System.out.println("male List id=="+userSolution.mId);
               // System.out.println("성별=="+mgender);
                break;
            }
        }

        if(mgender.equals("female")){
            UserSolution removeTarget = null;
       //     System.out.println("여자");
            //해당 id로 삭제
            for (UserSolution userSolution : femaleList) {
                if(userSolution.mId==mId){

                    removeTarget = userSolution;
                };
            }
            femaleList.remove(removeTarget);

            for (int i =0;i <femaleList.size(); i++) {
                if(femaleList.get(i).mGrade==mgrade){
                    result=femaleList.get(i).mId;
                    break;
                }
            }

        }// end female

        else if(mgender.equals("male")){
          //  System.out.println("남자");

            UserSolution removeTarget = null;
          //  System.out.println("여자");
            //해당 id로 삭제
            for (UserSolution userSolution : maleList) {
                if(userSolution.mId==mId){

                    removeTarget = userSolution;
                };
            }
            maleList.remove(removeTarget);

            for (int i =0;i <maleList.size(); i++) {
                if(maleList.get(i).mGrade==mgrade){
                    result=maleList.get(i).mId;
                    break;
                }
            }



        } // end male
        //remove 해당 값이 없을 때 return 0;
        else{
            result=0;}

        System.out.println("remove=="+result);
        return result;
    }// end remove

    public int query(int mGradeCnt, int mGrade[], int mGenderCnt, char mGender[][], int mScore) {
        ArrayList<UserSolution> userList = new ArrayList<>();
        System.out.println("query");
        for (char[] chars : mGender) {
            String mgender = String.valueOf(chars).trim();

            if(mgender.equals("female")){
                //학년별로 넣기
                for (int i : mGrade) {
                    for (UserSolution userSolution : femaleList) {
                        if(i==userSolution.mGrade && userSolution.mScore>=mScore){userList.add(userSolution);
                        System.out.println("female i=="+i +"  userId"+userSolution.mId+" 학년=="+ userSolution.mGrade);}
                    }
                }

            }else{
                for (int i : mGrade) {
                    for (UserSolution userSolution : maleList) {
                        if(i==userSolution.mGrade && userSolution.mScore>=mScore){userList.add(userSolution);
                        System.out.println("male i=="+i +"  userId"+userSolution.mId +"학년=="+ userSolution.mGrade);};
                    }
                }

            }//end else;
        }// end char[];


        return 0;
    }

}
