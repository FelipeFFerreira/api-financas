package br.ffn.financas.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import br.ffn.financas.model.Conta;

@Service
public class ContaService {
	private static List<Conta> contas = new ArrayList<>();
	private static Long nextId = 1L;
	
	public ContaService(Conta conta) {
		conta.setId(nextId++);
		contas.add(conta);
	}
	
	public List<Conta> findAll() {
		return contas;
	}
	
	public Conta find(Conta conta) {
		for (Conta c : contas) {
			if (c.equals(conta) ) {
				return c;
			}	
		}
		return null;
	}
	
	public Conta find(Long id) {
		return find(new Conta(id));
	}
	
	
	public boolean update(Conta conta) {
		Conta _conta = find(conta);
		if (_conta != null) {
			_conta.setAgencia(conta.getAgencia());
			_conta.setNumero(conta.getNumero());
			_conta.setSaldo(conta.getSaldo());
			_conta.setSaldo(conta.getSaldo());
			return true;
		}
		return false;
	}
	
	public boolean delete(Long id) {
		Conta _conta = find(id);
		if (_conta != null) {
			contas.remove(_conta);
			return true;
		}
		return false;
	}
}
