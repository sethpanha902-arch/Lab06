
class TrackViewsMixin:

    def track_view(self):
        self.views += 1


class DiscountMixin:

    def apply_discount(self, percent):
        return self.price - (self.price * percent / 100)


class Product:

    def __init__(self, name, price):
        self.name = name
        self.price = price


class DigitalProduct(Product, TrackViewsMixin, DiscountMixin):

    def __init__(self, name, price):
        super().__init__(name, price)
        self.views = 0

    def get_info(self):
        print("Product:", self.name)
        print("Price: $", self.price)
        print("Views:", self.views)


product = DigitalProduct("Java Course", 100)

product.get_info()

product.track_view()
product.track_view()
product.track_view()

print("\nAfter Tracking Views:")
product.get_info()

print("\nDiscounted Price: $",
      product.apply_discount(20))
