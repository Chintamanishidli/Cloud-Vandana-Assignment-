function submitForm() {
     const form = document.getElementById("surveyForm");
        if (form.checkValidity()) {
                const firstName = document.getElementById("firstName").value;
                const lastName = document.getElementById("lastName").value;
                const dob = document.getElementById("dob").value;
                const country = document.getElementById("country").value;
                const gender = Array.from(document.querySelectorAll('input[name="gender"]:checked')).map(e => e.value);
                const profession = document.getElementById("profession").value;
                const email = document.getElementById("email").value;
                const mobile = document.getElementById("mobile").value;

                // const popupContent = `
                //     <p>First Name: ${firstName}</p>
                //     <p>Last Name: ${lastName}</p>
                //     <p>Date of Birth: ${dob}</p>
                //     <p>Country: ${country}</p>
                //     <p>Gender: ${gender.join(", ")}</p>
                //     <p>Profession: ${profession}</p>
                //     <p>Email: ${email}</p>
                //     <p>Mobile Number: ${mobile}</p>
                // `;

                alert("Survey Submitted sucessfully:\n" )//+ popupContent);

                form.reset();
            }
        }