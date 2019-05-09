public class SampleTest {
   public SampleTest(String name) {
      // This constructor has one parameter, name.
      System.out.println("Passed Name is :" + name );
   }

   public static void main(String []args) {
      // Following statement would create an object myPuppy
      SampleTest myPuppy = new SampleTest( "tommy" );
   }
}