package com.hk.componentlib;

/**
 * Created by hk on 2019/5/19.
 */
public class ServiceFactory {

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        return ServiceFactoryHolder.INSTANCE;
    }

    private static class ServiceFactoryHolder {
        public static final ServiceFactory INSTANCE = new ServiceFactory();
    }

    private ILoginService loginService;

    private IMineService mineService;

    public ILoginService getLoginService() {
        return loginService;
    }

    public void setLoginService(ILoginService loginService) {
        this.loginService = loginService;
    }

    public IMineService getMineService() {
        return mineService;
    }

    public void setMineService(IMineService mineService) {
        this.mineService = mineService;
    }
}
