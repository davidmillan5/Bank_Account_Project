# PROJECT 1 — Core Banking Engine (Domain-Only, No Frameworks)

### 🎯 Objective

Model banking domain logic using pure Java (OOP mastery).

### 📌 Scope
- Account creation
- Deposit / Withdraw
- Transaction tracking
- Account types (Savings / Checking)




## Domain Model (UML)

```
               <<abstract>>
              BankAccount
-----------------------------------
- id: UUID
- ownerName: String
- balance: BigDecimal
- transactions: List<Transaction>
-----------------------------------
+ deposit(amount: BigDecimal): void
+ withdraw(amount: BigDecimal): void
+ getBalance(): BigDecimal

        ▲
        │
---------------------     ----------------------
SavingsAccount           CheckingAccount
---------------------     ----------------------
- interestRate: double    - overdraftLimit: BigDecimal
---------------------     ----------------------
+ applyInterest(): void   + withdraw(amount): void
+ withdraw(amount): void


```


```

Transaction
-----------------------------------
- id: UUID
- type: TransactionType
- amount: BigDecimal
- timestamp: LocalDateTime
- description: String

```





### ⚙️ Rules
- Savings cannot go below 0
- Checking allows overdraft
- Every operation generates a transaction

### ✅ Deliverables
- Fully working domain model
- Unit tests for all operations