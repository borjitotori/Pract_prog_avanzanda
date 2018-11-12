# Online shop storage manager

## Class explanation

All the classes crated have some attributes in common like the names or the ID, the plan is to use the name and ID for codification,
also the class **User** add a password for security purposes and the class **Product** that allows price and stock, this one is a boolean 
that we will use to know if this Product is avaiable for purchase and last this class has heritage from **Category** that will help us
to sort the products easly.

## Funtions

There are three basic funtions, **Login**, **Buy**, **See** and **Logout**

* **Login**: In this function the user logs in the app by the use of his username and the password (*this will be given at the end*) this
function also trigger a boolean that grants the user acces to the buy function.

* **Buy**: This function is only avaible if the user is login, here you can see a list of avaible products that will only appear if the are in stock, also you can add the to another list called shopping cart where you can see all the products you bought. 

* **See**: This function can be seen even without being loged in, this funtion does the same as buy but the user can add nothing to the cart.

* **Logout**: This function is quite easy and it only untrigger the boolean loged.

## User

* *User: Admin.*
* *Password: password*
Is important to respect the capital letters or else you wont be able to log in
