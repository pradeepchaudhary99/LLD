package ChainOfResponsibility;

public class CustomerSupportLevel2Handler implements CustomerSupport{
    CustomerSupport nextCustomerSupportHandler;
    @Override
    public void handleRequest(Request request) {
        if(request == Request.LEVEL2)
        {
            System.out.println("Handling Request 2 ");
        }
        else
        {
            System.out.println("Can't Handle Request, forwarding to Level 3");
            if(nextCustomerSupportHandler != null)
                nextCustomerSupportHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextRequestHandler(CustomerSupport customerSupport) {
        nextCustomerSupportHandler = customerSupport;
    }
}
