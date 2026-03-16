public class TestPostApp extends Post{ //take all of Post.java's stuff
    public static void main(String[] args){
    String author = "Alex Adam";
    String subject = "Help with JavaE";
    String message = "Hi, could anyone help me I need to learn how to code in java!";
    Post post = new Post(author, subject, message); //why do you work now????
    
    System.out.print(post); //printing twice??
    //toString(); 
    //for (int i = 0; i < 3; i++ ){
       // System.out.println(toString()[i]);
    //} 
    }
}