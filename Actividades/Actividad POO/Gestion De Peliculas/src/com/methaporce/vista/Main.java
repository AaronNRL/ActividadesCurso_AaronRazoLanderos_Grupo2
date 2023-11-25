package com.methaporce.vista;

import com.methaporce.modelo.GestorPelicula;
import com.methaporce.modelo.Pelicula;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        GestorPelicula gestor = new GestorPelicula();

        // Crear instancias de películas
        Pelicula pelicula1 = new Pelicula(1, "Pelicula 1", true);
        Pelicula pelicula2 = new Pelicula(2, "Pelicula 2", false);
        Pelicula pelicula3 = new Pelicula(3, "Pelicula 3", true);

        // Agregar películas al gestor
        gestor.AgregarPelicula(pelicula1);
        gestor.AgregarPelicula(pelicula2);
        gestor.AgregarPelicula(pelicula3);

        // Eliminar una película
        gestor.EliminarPelicula(2);

        // Marcar una película como activa
        gestor.MarcarPeliculaComoDisponible(1);

        // Mostrar la lista de películas no disponibles
        System.out.println("Películas no disponibles:");
        for (Pelicula pelicula : gestor.ObtenerPeliculasNoDisponibles()) {
            System.out.println(pelicula.getNombre());
        }

        // Llamada al método ObtenerPeliculasDisponibles
        System.out.println("Películas disponibles:");
        List<Pelicula> peliculasDisponibles = gestor.ObtenerPeliculasDisponibles();
        for (Pelicula pelicula : peliculasDisponibles) {
            System.out.println(pelicula.getNombre());
        }

        // Llamada al método ObtenerPeliculas
        System.out.println("Todas las películas:");
        List<Pelicula> todasLasPeliculas = gestor.ObtenerPeliculas();
        for (Pelicula pelicula : todasLasPeliculas) {
            System.out.println(pelicula.getNombre() + " - Disponible: " + pelicula.isDisponible());
        }
    }
}





