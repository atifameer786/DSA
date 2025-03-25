public class Subject {

    String subjectId;
    String subjectName;
    int maxMarks;
    int obtainedMarks;

    public int getMaxMarks(){
        return maxMarks;
    }
    public int getObtainedMarks(){
        return obtainedMarks;
    }
    public void setObtainedMarks(int m){
        obtainedMarks= m;
    }



    public class Student {

        String studentName;
        String studentDep;
        int rollNo;
        String[] subjects =  new String[5];


        public String[] setSubjects(String[] a,int n){

            for(int i=0;i<n;i++){
                subjects[i] = a[i];
            }

            
      

            return a;

        }



    
        
    }


    
}
