package com.algaworks.awpag.api.controller;

import com.algaworks.awpag.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar() {
        var cliente0 = new Cliente(1L, "Luiz Otávio", "luizotaviomtbs@gmail.com", "189981213432");
        var cliente1 = new Cliente(1L, "Luiz Otávio", "luizotaviomtbs@gmail.com", "189981213432");
        var cliente2 = new Cliente(1L, "Luiz Otávio", "luizotaviomtbs@gmail.com", "189981213432");
        var cliente3 = new Cliente(1L, "Luiz Otávio", "luizotaviomtbs@gmail.com", "189981213432");
        var cliente4 = new Cliente(1L, "Luiz Otávio", "luizotaviomtbs@gmail.com", "189981213432");
        var cliente5 = new Cliente(1L, "Luiz Otávio", "luizotaviomtbs@gmail.com", "189981213432");
        List<Cliente> list = Arrays.asList(cliente0);
        return list;
    }
}
