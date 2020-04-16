package br.edu.up.Interface;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.up.model.Funcionario;

public interface FuncionarioInterface extends JpaRepository<Funcionario, Integer> {

}
