package com.ha.expenseive.Expenseive.Controller;

import com.ha.expenseive.Expenseive.Model.Expense;
import com.ha.expenseive.Expenseive.Repository.ExpenseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ExpenseController {
    @Autowired
    ExpenseRepo expenseRepo;

    @GetMapping("/expense")
    Optional<Expense> fetchExpense(@RequestBody Expense expense) {
        Optional<Expense> fetchedExpense = null;
        try{
            fetchedExpense = expenseRepo.findById(expense.getUuid());
        } catch (Exception e) {
            System.out.print("Exception: " + e);
        }

        return fetchedExpense;
    }

    @PostMapping("/expense")
    Expense saveExpense(@RequestBody Expense expense) {
        Expense savedExpense = null;
        try{
            savedExpense = expenseRepo.insert(expense);
        } catch (Exception e) {
            System.out.print("Exception: " + e);
        }
        
        return savedExpense;
    }
}
