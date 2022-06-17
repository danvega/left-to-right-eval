# Left to Right Eval

The operations should not follow normal order of operations. Who remembers PEMDAS

- P: Parentheses first
- E: Exponents (ie Powers and Square Roots, etc.)
- MD: Multiplication and Division (left-to-right)
- AS: Addition and Subtraction (left-to-right)

Instead, follow operations from left to right:

- "3+5*2-5" should be 11
- "3+100-50+2 should be 55
- "3*100-50/2" should be 125
- "1234567+5*2-5" should be 2469139