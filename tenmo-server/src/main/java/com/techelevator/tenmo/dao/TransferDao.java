package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.Transfer;
import com.techelevator.tenmo.model.TransferDTO;
import com.techelevator.tenmo.model.User;

import java.util.List;

public interface TransferDao {

    List<Transfer> listOfUsers();

    void create(TransferDTO transferDTO);

    Transfer getTransferById(int transferId);

    List<Transfer> getAllTransfers();

    List<Transfer> getAllSent(int typeId);

    List<Transfer> getAllRequest(int typeId);


   // Transfer update(Transfer transfer, int transferID);







}
