public class Calculator {

    private int result = 0;


    public int resultCalculator(String[] strList) {
        result += Integer.parseInt(strList[0]);
        int index = 1;
        while(strList.length > index){
            String operator = strList[index++];
            int operand = Integer.parseInt(strList[index++]);
            result = operatorCheck(result, operator, operand);
        }
        return result;
    }

    public int operatorCheck(int result, String operator, int operand){
        if("+".equals(operator)){
            result = plus(result, operand);
        } else if("-".equals(operator)){
            result = minus(result, operand);
        } else if("*".equals(operator)) {
            result = multiple(result, operand);
        } else if("/".equals(operator)){
            result = division(result, operand);
        } else {
            throw new IllegalArgumentException();
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
