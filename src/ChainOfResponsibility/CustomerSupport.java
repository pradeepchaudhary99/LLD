package ChainOfResponsibility;


enum Request
{
    LEVEL1, LEVEL2, LEVEL3
}
public interface CustomerSupport {

    void handleRequest(Request request);
    void setNextRequestHandler(CustomerSupport customerSupport);
}