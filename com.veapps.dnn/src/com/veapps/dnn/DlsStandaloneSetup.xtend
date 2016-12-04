package com.veapps.dnn

/**
 * Created by xpitfire on 04.12.16.
 */
class DlsStandaloneSetup extends DlsStandaloneSetupGenerated {
    def static void doSetup() {
        new DlsStandaloneSetup().createInjectorAndDoEMFRegistration()
    }
}