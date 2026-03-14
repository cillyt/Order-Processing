# Варіант: V25 (P1 + R5)

Індивідуальні умови вашого варіанта:

Профіль оплати P1: CardPayment: дозволяє суму до 20_000; PayPalPayment: приймає суму від 100; BankTransferPayment: комісія 1%.
Пакет правил R5: валідація - сума замовлення має бути >= 500.
Знижки/комісії: знижка 3% для способу оплати BankTransferPayment.
Переходи станів: NEW -> PAID -> INVOICE_SENT -> SHIPPED -> DELIVERED.
Додатковий крок Template Method: реалізувати крок generateInvoice.
Обов'язковий негативний сценарій: передбачити і протестувати виняток InvoiceGenerationException.
