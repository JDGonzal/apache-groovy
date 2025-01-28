package clone

def p = new Person(first: 'Juan', last: 'Piza', favItems: ['Learning', 'coding'], since: new Date())
def p2 = p.clone()

assert p instanceof Cloneable
assert p.favItems instanceof Cloneable
assert p.since instanceof Cloneable
assert !(p.first instanceof Cloneable)

assert !p.is(p2)
assert !p.favItems.is(p2.favItems)
assert !p.since.is(p2.since)
assert p.first.is(p2.first)

