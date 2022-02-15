package demoapp.service;

import org.springframework.stereotype.Service;

@Service
public class SaludoService {
    public String saluda(String nombre) {
        return "Hola " + nombre;
    }
    public String despedida(String nombre) {
        return "Hasta pronto " + nombre;
    }
}