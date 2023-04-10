public class test {
    public static  void main(String[] args){
        int num[];

        int n = 1024;

        for(int i=1;i<n;i++){
            if(n%i == 0){
                num.add(n%i);
            }
        }
    }
}
