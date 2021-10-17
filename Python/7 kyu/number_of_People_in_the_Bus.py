# https://www.codewars.com/kata/5648b12ce68d9daa6b000099/train/python

# My solution:
def number(bus_stops):
    result = 0
    for bus_stop in bus_stops:
        result = result + bus_stop[0] - bus_stop[1]
    return result

# Other solution:
def number(bus_stops):
    return sum(on - off for on, off in bus_stops)

