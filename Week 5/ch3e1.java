/* Excercise Desc:
 *  Suppose that you have created a program with only the following variables.
    int a = 5;
    int b = 6;
    Suppose that you also have a method with the following header:
    public static void mathMethod(int a)
    Which of the following method calls are legal 
 * The only legal calls are: a, b, c, e, j
 * 
 * I will write them below:
 */

 class ch3e1{
    public static void main(String[] args){
        int a = 5;
        int b = 6;

        mathMethod(a);
        mathMethod(b);
        mathMethod(a+b);
        mathMethod(2361);
        mathMethod(a/b);

    }
    public static void mathMethod(int a){
        System.out.println(a);
    }

 }
