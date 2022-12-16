public class Arithmetic {
    public static double sumOperation (double ... args){
        double sum = 0;
        for (int i = 0; i < args.length; i++){
            sum += args[i];
        }
        return sum;
    }

    public static double substractOperation (double ... args){
        double sum = args[0];
        for (int i = 1; i < args.length; i++){
            sum -= args[i];
        }
        return sum;
    }

    public static double multiplyOperation (double ... args){
        double sum = args[0];
        for (int i = 1; i < args.length; i++){
            sum *= args[i];
        }
        return sum;
    }

    public static double devideOperation (double ... args){
        double sum = args[0];
        for (int i = 1; i < args.length; i++){
            sum /= args[i];
        }
        return sum;
    }
}
