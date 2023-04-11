package maths;

public class NewtonRaphsonroot {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }
    static double sqrt(int n){
        double x =n;
        double root;
        while(true){
            root = 0.5*(x+(n/x));
//            System.out.println(root);
            if(Math.abs(root-x)==0){
                break;
            }
            x = root;
        }
        return root;
    }
}

