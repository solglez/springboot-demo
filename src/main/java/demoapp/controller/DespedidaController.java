package demoapp.controller;

import demoapp.service.SaludoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class DespedidaController {
    private final SaludoService service;

    @Autowired
    public DespedidaController(SaludoService service) {
        this.service = service;
    }

    @RequestMapping("/nada/{nombre}")
    public @ResponseBody
    String saludo(@PathVariable(value="nombre") String nombre) {
        return service.despedida(nombre);
    }
}
