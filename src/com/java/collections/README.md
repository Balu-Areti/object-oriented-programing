```java
// ==========================================
// 1. HASHSET INITIALIZATIONS
// ==========================================

// APPROACH A: Using Set
// Why use this?
// We normally use this because it is flexible.
// If we want to change HashSet to another Set later,
// we can easily change the right side.
//
// Set = Interface
// HashSet = Actual class
Set<Customer> customers1 = new HashSet<>();


// APPROACH B: Using HashSet
// Why use this?
// We use this when we specifically want to work with HashSet.
//
// But normally, we prefer using Set on the left side.
HashSet<Customer> customers2 = new HashSet<>();



// ==========================================
// 2. TREESET INITIALIZATIONS
// ==========================================

// APPROACH A: Using Set
// Why use this?
// We use this when we want sorted data,
// but we don't need special TreeSet methods.
//
// TreeSet automatically keeps the data in sorted order.
Set<Customer> customers3 = new TreeSet<>();


// APPROACH B: Using TreeSet
// Why use this?
// We use this when we want to use special TreeSet methods.
//
// Examples:
// first()
// last()
// higher()
// lower()
//
// These methods are available when we use TreeSet as the reference.
TreeSet<Customer> customers4 = new TreeSet<>();



/*
 * ==========================================
 * QUICK SUMMARY
 * ==========================================
 *
 * No sorting needed:
 *
 * Set<Customer> customers = new HashSet<>();
 *
 *
 * Sorting needed:
 *
 * Set<Customer> customers = new TreeSet<>();
 *
 *
 * Need special TreeSet methods:
 *
 * TreeSet<Customer> customers = new TreeSet<>();
 *
 *
 * SIMPLE RULE:
 *
 * Left side  -> What we can use
 * Right side -> What object we create
 *
 *
 * Set<Customer> customers = new HashSet<>();
 *       ↑                    ↑
 *   What we use         Object created
 *
 * Set<Customer> customers = new TreeSet<>();
 *       ↑                    ↑
 *   What we use         Object created
 */
```
