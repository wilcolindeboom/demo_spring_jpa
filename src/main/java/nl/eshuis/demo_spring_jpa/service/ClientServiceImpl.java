package nl.eshuis.demo_spring_jpa.service;

import nl.eshuis.demo_spring_jpa.model.Client;
import nl.eshuis.demo_spring_jpa.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client getClientById(long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteClient(long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public long saveClient(Client client) {
         Client newClient =  clientRepository.save(client);
        return newClient.getId();
    }

    @Override
    public void updateClient(long id, Client client) {
        Client existingClient = clientRepository.findById(id).orElse(null);
        existingClient.setFirstName(client.getFirstName());
        existingClient.setLastName(client.getLastName());
        clientRepository.save(existingClient);
    }

    @Override
    public Client getClientByLastName(String lastName) {
        return clientRepository.findByLastNameIgnoreCase(lastName);
    }


}