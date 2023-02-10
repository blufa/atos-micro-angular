
export interface User {
  id?: number|null;
  firstName : string;
  lastName: string;
  email: string;
  address: string;
  dob?: string;
  phoneNumber: string;
  occupation: string;
  photo?: string;
}

//export type UserList = PaginatedList<User>;

