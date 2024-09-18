def check_even_odd(n):
    return "Even" if n % 2 == 0 else "Odd"

num = int(input("Enter a number: "))
result = check_even_odd(num)
print(f"{num} is {result}.")
