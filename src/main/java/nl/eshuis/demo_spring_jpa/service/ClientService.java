package nl.eshuis.demo_spring_jpa.service;

import nl.eshuis.demo_spring_jpa.model.Client;

import java.util.List;

public interface ClientService {

    List<Client> getAllClients();
    Client getClientById(long id);
    void deleteClient(long id);
    long saveClient(Client client);
    void updateClient(long id, Client client);
    Client getClientByLastName(String lastName);

}


