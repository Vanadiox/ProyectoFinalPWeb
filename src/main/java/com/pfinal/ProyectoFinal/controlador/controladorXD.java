/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pfinal.ProyectoFinal.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class controladorXD {
    
    
    @GetMapping("/")
    public String index(){
    
        return "index/index";
    }
    
    @GetMapping("/destino")
    public String destino(){
        return "destino/destino";
    }
    
    @GetMapping("/errorlog")
    public String nogood(){
        return "errorlog/errorlog";
    }
    
}
