This assignment was for my Object Oriented Programming class.
The assignment asked for us to build a application where the cashier uses a UPC scanner(type into the terminal the UPC code)
and have the system "ring up" that particular order. It connects the UPC given to the one they have in the database, which in 
my example it's only 5 products. Futhermore, it should handle errors/unexpected inputs while 
successfully generating a receipt.




------------------

Below are my Java Doc Notes explaining what certain blocks of code does.

# Java
Main Class and the secondary file is the Product class.
(Line 6) Inside of the main class, we also implement the scanner method which would
act like the UPC scanner, taking in the code and throwing an error if the UPC code doesn't
match the available products. 

(Line 40 - 44) If the UPC scanner gets a UPC code from the cashier. (Line 31 - 36) it calls on the Product class,
and ensures that the ups code inputed matches one of the available instances. In which, it prints to 
the terminal for the cashier to see that it successfully was added to the register and will be calculated further.

(Line 40-44) art of the use case, is having a redirection in case putting a upc item does not work. 
which will in this code throw a error (!notfound) and the (NumberFormatException e) in case they type 
in the wrong data type (like a letter)

Speaking about the Product class and it’s methods:
In the beginning, we call on the scanner function and initialize the transaction to 0
(reference to totalPrice) In the external file, Product. We have the constructor for initializing 
each of the new objects, with the correct data type. String for the "ingredient" a integer for the 
solid number upc, and double for the price. (which is also why total price is a double type) 
That being said, in the Product class we also need to get these values (upc,price) which is not a void method, 
but public. to implement lines 32-37 of our try block. The product class also maintains a relationship with the
"Register" class, by providing the output of the total sum of goods with the receipt section (lines 48-52)
