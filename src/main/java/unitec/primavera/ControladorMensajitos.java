/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.primavera;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author T-107
 */
@RestController
@RequestMapping("/api")//aqui van los nombres de los mapeos generales
public class ControladorMensajitos {
    
    @Autowired RepositorioMensaje mensa;
    //Mi primer hola mundo desde REST API con spring
    @GetMapping(path="/hola")
    public String hola(){
        return ("Hola Mundo");
    }
    //Buscamos todos
    @GetMapping(path="/mensaje")
    public List<Mensajito>todos(){
        return mensa.findAll();
    }
    //Buscamos por ID
    @GetMapping(path="/mensaje/{id}")
    public Mensajito buscarPorIde(@PathVariable String id){
        return mensa.findById(id).get();
    }
}
