package ChainOfResponsibility;

public class Driver {
    public static void main(String[] args) {

        CustomerSupportLevel1Handler level1 = new CustomerSupportLevel1Handler();
        CustomerSupportLevel2Handler level2 = new CustomerSupportLevel2Handler();
        CustomerSupportLevel3Handler level3 = new CustomerSupportLevel3Handler();

        level1.setNextRequestHandler(level2);
        level2.setNextRequestHandler(level3);
        level3.setNextRequestHandler(null);

        level1.handleRequest(Request.LEVEL1);
        level1.handleRequest(Request.LEVEL2);
        level1.handleRequest(Request.LEVEL3);


    }
}
