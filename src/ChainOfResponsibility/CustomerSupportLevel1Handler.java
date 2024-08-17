package ChainOfResponsibility;

public class CustomerSupportLevel1Handler implements CustomerSupport{

    CustomerSupport nextCustomerSupportHandler;
    @Override
    public void handleRequest(Request request) {
        if(request == Request.LEVEL1)
        {
            System.out.println("Handling Request 1 ");
        }
        else
        {
            System.out.println("Can't Handle Request, forwarding to Level 2");
            if(nextCustomerSupportHandler != null)
                nextCustomerSupportHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextRequestHandler(CustomerSupport customerSupport) {
        nextCustomerSupportHandler = customerSupport;
    }
}
