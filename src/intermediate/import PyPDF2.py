import pikepdf

def remove_pdf_password(input_pdf, output_pdf, password_list):
    try:
        # Try each password in the list
        for password in password_list:
            try:
                pdf = pikepdf.open(input_pdf, password=password)
                print(f"Password found: {password}")
                break
            except pikepdf.PasswordError:
                continue
        else:
            print("No valid password found.")
            return
        
        # Save the PDF without password protection
        pdf.save(output_pdf)
        print(f"Password removed. Decrypted PDF saved as {output_pdf}")
    except Exception as e:
        print(f"An error occurred: {e}")

# Example usage
input_pdf = r"c:\Users\THIS PC\Downloads\479190.pdf"
output_pdf = r"c:\Users\THIS PC\Downloads\decrypted_479190.pdf"
password_list = ["password1", "password2", "password3"]  # Add more passwords as needed

remove_pdf_password(input_pdf, output_pdf, password_list)


