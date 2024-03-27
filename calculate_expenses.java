def calculate_expenses(quantity, price_per_item):
    total_expenses = quantity * price_per_item

    if quantity > 50:
        discount = 0.1  
    elif 25 <= quantity <= 50:
        discount = 0.05  
    else:
        discount = 0  

    total_expenses = total_expenses * discount

    return total_expenses

def main():
    try:
        quantity = int(input("Enter the quantity purchased: "))
        price_per_item = float(input("Enter the price per item: $"))
        
        if quantity < 0 or price_per_item < 0:
            raise ValueError("Quantity and price per item must be non-negative.")

        total_expenses = calculate_expenses(quantity, price_per_item)
        print("Total expenses: ${:.2f}".format(total_expenses))
    except ValueError as e:
        print("Error:", e)

if __name__ == "__main__":
    main()
