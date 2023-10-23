package com.utn.elbuensabor.entities.usuarios;

import com.utn.elbuensabor.entities.Base;
import com.utn.elbuensabor.entities.enums.Rol;
import com.utn.elbuensabor.entities.pedidos.Pedido;
import jakarta.persistence.*;

import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "persona")
@Builder
public class Persona extends Base {

    @NotNull
    @Column(name = "email", nullable = false)
    private String email;

    @NotNull
    @Column(name = "password", nullable = false)
    private String password;

    @NotNull
    @Column(name="rol")
    @Enumerated(EnumType.STRING)
    private Rol rol;

    @NotNull
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @NotNull
    @Column(name = "apellido", nullable = false)
    private String apellido;

    @Column(name = "telefono", nullable = false)
    private String telefono;

    @OneToMany (mappedBy = "usuario", cascade = CascadeType.ALL)
    @Builder. Default
    private List<Domicilio> domicilios = new ArrayList<>();

    @OneToMany (mappedBy = "cliente", cascade = CascadeType.ALL)
    @Builder. Default
    private List<Pedido> pedidos = new ArrayList<>();


    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    @Builder.Default
    private List<NotaCredito> notasCredito = new ArrayList<>();

}
