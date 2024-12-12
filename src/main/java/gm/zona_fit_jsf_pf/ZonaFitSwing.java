package gm.zona_fit_jsf_pf;

import com.formdev.flatlaf.FlatDarculaLaf;
import gm.zona_fit_jsf_pf.gui.ZonaFitForma;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;

@SpringBootApplication

public class ZonaFitSwing {
    public static void main(String[] args) {
//        Se configura el modo oscuaro, previo al objeto de Swing
        FlatDarculaLaf.setup();
//        Instacia la fabrica de spring
        ConfigurableApplicationContext contextoSpring = new SpringApplicationBuilder(ZonaFitSwing.class)
                .headless(false).web(WebApplicationType.NONE).run(args);

//        Crear un objeto de Swing
        SwingUtilities.invokeLater(() -> {
            ZonaFitForma zonaFitForma = contextoSpring.getBean(ZonaFitForma.class);
            zonaFitForma.setVisible(true);
        });
    }
}
