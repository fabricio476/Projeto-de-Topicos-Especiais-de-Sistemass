package br.edu.up.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.up.Interface.FuncionarioInterface;
import br.edu.up.model.Funcionario;

@RestController
@RequestMapping
public class FuncionarioController {

	private FuncionarioInterface funcRep;
	
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Funcionario> ListAll()
	{
		Iterable<Funcionario> list = funcRep.findAll();
		return list;
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Funcionario getById(@PathVariable Integer id)
	{
		Funcionario func = funcRep.getOne(id);
		return func;
	}
	
	@PostMapping
	public Funcionario add(@RequestBody @Valid Funcionario func)
	{
		return funcRep.save(func);
	}
	
	@DeleteMapping("/{id}")
	public Funcionario delete(@PathVariable Integer id)
	{
		Funcionario func = funcRep.getOne(id);
		funcRep.delete(func);
		return func;
	}
	
}
