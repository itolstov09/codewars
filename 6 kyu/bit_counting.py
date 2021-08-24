# https://www.codewars.com/kata/526571aae218b8ee490006f4/train/python



# My solution:
def my_count_bits():
    n = 132456789
    return bin(n).count("1")

# Other solution:
def count_bits():
    n = 132456789
    total = 0
    while n > 0:
        total += n % 2
        n >>= 1
    return total


from timeit import timeit

# timeit tests:
print(timeit(my_count_bits)) # 0.2970231
print(timeit(count_bits)) # 2.4929801

