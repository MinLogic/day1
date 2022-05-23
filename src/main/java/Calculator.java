public class Calculator {

    private int result = 0;


    public int resultCalculator(String[] strList) {
        result += Integer.parseInt(strList[0]);
        int index = 1;
        while(strList.length > index){
            String operator = strList[index++];
            if("+".equals(operator)){
                result = plus(result, Integer.parseInt(strList[index++]));
            } else if("-".equals(operator)){
                result = minus(result, Integer.parseInt(strList[index++]));
            } else if ("*".equals(operator)) {
                result = multiple(result, Integer.parseInt(strList[index++]));
            } else {
                result = division(result, Integer.parseInt(strList[index++]));
            }
        }

        return result;
    }

    public int plus(int a, int b){
        return a+b;
    }

    public int minus(int a, int b){
        return a-b;
    }

    public int multiple(int a, int b){
        return a*b;
    }

    public int division(int a, int b){
        return a/b;
    }
}
