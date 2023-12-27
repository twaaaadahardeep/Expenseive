package com.ha.expenseive.Expenseive.Repository;

import com.ha.expenseive.Expenseive.Model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepo extends MongoRepository<Expense, String> {
}
