/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{ 
    public static string scrambleWord(String start_word){

     char[] wordarray = start_word.toCharArray();

        char[] dummywordarray = start_word.toCharArray();

        Random random = new Random();

        int r = random.nextInt(wordarray.length-1);
        int i = 0;

        int j = r+1;

        while(i <= r){

            dummywordarray[wordarray.length -i-1] = wordarray[i];

            i++;
        }


        while (j <= wordarray.length -1){

            dummywordarray[j-r-1] = wordarray[j];

            j++;

        }

        String newword = String.valueOf(dummywa);



        return newword;
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
