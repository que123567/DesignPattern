package Lab6;

/**
 * Created by smaug on 2017/4/20.
 */
interface SoftWare
{
    public void run();
}

public class ProxyPattren
{
    class ProxyApplication implements SoftWare
    {
        private RealApplication realApp = new RealApplication();

        @Override
        public void run() {
            realApp.run();
        }
    }

    class RealApplication implements SoftWare
    {
        @Override
        public void run() {
            System.out.println("RealApplication is running");
        }
    }

}
