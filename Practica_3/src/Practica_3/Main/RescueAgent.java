/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica_3.Main;


import com.sun.javafx.geom.Vec3d;
import java.util.List;

/**
 *
 * @author Alberto
 */
public class RescueAgent extends Agent{
    private static List<Vec3d> targetList;
    private Vec3d bestTarget;

    public RescueAgent(String id, float fuel_limit) throws Exception {
        super(id, AgentType.FLY, fuel_limit);
    }
    
    /**
     * The way the agent goes
     * @return The next action to perform
     */
    @Override
    protected Vec3d chooseMovement() {
        // Si se ha llamado a este método es que el plan anterior ha finalizado
        // y se debe "rebotar" hacia una dirección opuesta.
        
        // Para rebotar hay que intentar definir el ángulo opuesto al que se seguía
        // con una mutación ligera pseudoaleatoria, elegir una casilla del borde del mapa
        // en esa dirección y mandar al algoritmo a buscar un plan.
        
        throw new UnsupportedOperationException("Paluego");
    }
    
    private void updateTargets() {

    }
    private void chooseBestTarget(){

    }

}
