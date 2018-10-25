class Chick implements Animal {     
     private String myType;
     private String mySoundOne;
     private String mySoundTwo;
     
     public Chick(String type, String soundOne, String soundTwo){
       myType = type;
       mySoundOne = soundOne;
       mySoundTwo = soundTwo;
     }
     
     public String getSound(){
       int soundChooser = (int)(Math.random() * 2);
       
       if(soundChooser == 0){
         return mySoundOne;
       } else {
         return mySoundTwo;
       }
     }
     
     public String getType(){
       return myType;
     }
}
