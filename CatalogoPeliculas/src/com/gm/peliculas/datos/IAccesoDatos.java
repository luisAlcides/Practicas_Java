package com.gm.peliculas.datos;

import com.gm.peliculas.excepciones.LecturaDatosEx;
import com.gm.peliculas.excepciones.EscrituraDatosEx;
import com.gm.peliculas.excepciones.AccesoDatosEx;
import java.util.List;
import com.gm.peliculas.domain.Pelicula;

public interface IAccesoDatos {

    boolean existe(String nombreRecurso) throws AccesoDatosEx;

    List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx;

    void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx;

    String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx;

    void crear(String nombreRecurso) throws AccesoDatosEx;

    void borrar(String nombreRecurso) throws AccesoDatosEx;
}
