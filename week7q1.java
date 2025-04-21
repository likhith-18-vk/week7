abstract  class Animal {
    abstract void Sound();
}
class lion extends Animal {
    public void Sound(){
        System.out.println("lRoar");
    }}
class Tiger extends Animal {
    public void Sound(){
        System.out.println("tRoar");
          }}
class week7q1 {
    public static void main(String[] args){
        System.out.println("NAME: P SAI LIKHITH ,ROLL NO :AV.SC.U4CSE24306,SEC:CSE-A"); 
lion l =new lion();
l.Sound();
Tiger t = new Tiger();
t.Sound();
    }}
