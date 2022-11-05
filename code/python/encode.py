# A Pyton utility program to encode and decode strings to Base64
import base64

# Encoding the message as bytes
secret_message_bytes = "Sunday Lunch at Konda's".encode('utf-8')

# Encode the message to base64
secret_message_base64 = base64.b64encode(secret_message_bytes)

# Fetch the encoded message
secret_message_base64_decode = secret_message_base64.decode('utf-8')

# Print the message to the console
print(secret_message_base64_decode)

# It'll print: U3VuZGF5IEx1bmNoIGF0IEtvbmRhJ3M=
